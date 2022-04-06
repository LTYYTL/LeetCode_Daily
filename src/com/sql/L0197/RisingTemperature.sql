/*

 197. 上升的温度
SQL架构
表： Weather

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| recordDate    | date    |
| temperature   | int     |
+---------------+---------+
id 是这个表的主键
该表包含特定日期的温度信息

编写一个 SQL 查询，来查找与之前（昨天的）日期相比温度更高的所有日期的 id 。
返回结果 不要求顺序 。

示例 1：
输入：
Weather 表：
+----+------------+-------------+
| id | recordDate | Temperature |
+----+------------+-------------+
| 1  | 2015-01-01 | 10          |
| 2  | 2015-01-02 | 25          |
| 3  | 2015-01-03 | 20          |
| 4  | 2015-01-04 | 30          |
+----+------------+-------------+
输出：
+----+
| id |
+----+
| 2  |
| 4  |
+----+
解释：
2015-01-02 的温度比前一天高（10 -> 25）
2015-01-04 的温度比前一天高（20 -> 30）

 */

-- datediff()比较时间，返回前面日期-后面日期的天数
select Weather.id as 'id'
from Weather
join Weather w
where datediff(Weather.recordDate,w.recordDate) = 1 and Weather.Temperature > w.Temperature
