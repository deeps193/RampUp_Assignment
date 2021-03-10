DELIMITER //
CREATE PROCEDURE User1Read()
BEGIN 
	
	SELECT  First_Name, Last_Name, DateofBirth, Age
    FROM   User1 
    WHERE  (Age = 23) ;
END //
DELIMITER ;