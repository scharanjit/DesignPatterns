----- STORED PROCEDURE QUERY #1 -----
DELIMITER $
CREATE PROCEDURE findAllEmployees ()
	BEGIN
		SELECT * FROM employee;
	END $
DELIMITER ;


----- STORED PROCEDURE QUERY #2 -----
DELIMITER $
CREATE PROCEDURE findEmployeeByDepartment (IN emp_department VARCHAR(200))
	BEGIN
		SELECT * FROM employee emp WHERE emp.edept = emp_department;
	END $
DELIMITER ;


----- STORED PROCEDURE QUERY #3 -----
DELIMITER $
CREATE PROCEDURE findEmployeeCountByDesignation (IN emp_designation VARCHAR(200), OUT designation_count INT(50))
	BEGIN
		SELECT COUNT(*) INTO designation_count FROM employee emp WHERE emp.edesig = emp_designation;
	END $
DELIMITER ;