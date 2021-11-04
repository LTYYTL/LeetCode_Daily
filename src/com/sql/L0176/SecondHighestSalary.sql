/*
 176. 第二高的薪水
SQL架构
编写一个 SQL 查询，获取 Employee 表中第二高的薪水（Salary） 。

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
例如上述 Employee 表，SQL查询应该返回 200 作为第二高的薪水。如果不存在第二高的薪水，那么查询应返回 null。

+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
 */
/*
    ifnull(a,b):不为null取a,为null取b
*/
select ifnull(
    (select distinct salary
        from employee
        order by salary DESC /* 按照salary降序 */
        limit 1,1),/* 取第二个 */
    null)
as SecondHighestSalary