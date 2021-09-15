package rs.itbootcamp.dao;

import rs.itbootcamp.model.DatabaseConnection;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MealDaoSQL implements MealDao {
    private static final Connection conn = DatabaseConnection.getConnection();

    @Override
    public void insert(MealModel mm) {
        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTOO meal " +
                    " VALUES(?,?,?,?)");
            st.setInt(1, mm.getMealId());
            st.setString(2, mm.getMealName());
            st.setString(3, mm.getMealDesc());
            st.setString(4, mm.getMealDifficulty());
            st.executeUpdate();
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM meal WHERE meal_id = ?";
        PreparedStatement st = conn.prepareStatement(query);

    }

    @Override
    public void update(MealModel mm) {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE meal" +
                    " SET meal_id = ?," +
                    "meal_name = ?," +
                    "meal_desc = ?," +
                    "meal_difficulty = ?," +
                    "WHERE meal_id = ?");
            st.setInt(1, mm.getMealId());
            st.setString(2, mm.getMealName());
            st.setString(3, mm.getMealDesc());
            st.setString(4, mm.getMealDifficulty());
            st.executeUpdate();
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @Override
    public MealModel getMeal(int id) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM meal WHERE meal_id = ? ");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MealModel> getAllMeals() {
        List<MealModel> mealList = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM meal");
            while (rs.next()) {
                MealModel mm = new MealModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                mealList.add(mm);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return mealList;
    }

    @Override
    public List<String> getFoodMealNames(int meal_id) {
        List<String> list = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT food_name FROM food f INNER JOIN mealfood mf ON mf.food_id = f.food_id WHERE meal_id = " + meal_id);
            while (rs.next())
                list.add(rs.getString(1));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;

    }

    @Override
    public List<FoodModel> getFoodMeal(int meal_id) {
        List<FoodModel> list = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food f INNER JOIN mealfood mf ON mf.food_id = f.food_id WHERE meal_id = " + meal_id);

            while (rs.next())
                list.add(new FoodModel(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getDouble(3),
                                rs.getDouble(4),
                                rs.getDouble(5),
                                rs.getDouble(6)
                        )
                );

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

