import rs.itbootcamp.dao.FoodDaoSQL;
import rs.itbootcamp.model.FoodModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        FoodDaoSQL fd = new FoodDaoSQL();
        FoodModel food=new FoodModel(15496,"Jogurt",58.8,3.7,2.5,3);
        //fd.insert(food);//vec postoji
        food.setFoodFat(5);
        fd.update(food);

    }
}
