--Izvuci iz zaposlenih e-mail i telefon svih koji imaju telefon i koji su iz evrope (susan.marvis i hermann.baer) (probati ovo bez join-a i bez naredbe AND)
SELECT email, phone_number
FROM employees
WHERE employees.department_id IN (SELECT departments.department_id FROM departments
       WHERE departments.location_id IN (SELECT locations.location_id FROM locations
                                      WHERE locations.country_id IN (SELECT countries.country_id FROM countries
                                             WHERE countries.region_id IN (SELECT regions.region_id FROM regions
                                                    WHERE regions.region_name = 'Europe'))))
                                                    GROUP BY phone_number, email
                                                    HAVING phone_number IS NOT NULL;


--Izvuci svu decu onih koji zaradjuju najvise
SELECT * 
FROM dependents
WHERE dependents.employee_id IN (SELECT employees.employee_id FROM employees
                                 WHERE employees.salary IN (SELECT MAX(salary) FROM employees));

--Sortirati drzave po ukupnoj zaradi njihovih drzavljana opadajuce
SELECT countries.country_name, SUM(salary)
FROM countries
JOIN locations ON locations.country_id = countries.country_id
JOIN departments ON departments.location_id = locations.location_id
JOIN employees ON employees.department_id = departments.department_id
GROUP BY countries.country_name
ORDER BY SUM(employees.salary) DESC;
