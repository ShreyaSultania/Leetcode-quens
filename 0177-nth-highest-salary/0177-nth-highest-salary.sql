CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=N-1;
  RETURN (

      # Write your MySQL query statement below.
        Select DISTINCT salary from Employee order by salary desc limit N,1
  );
END