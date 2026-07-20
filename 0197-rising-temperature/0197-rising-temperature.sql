/* Write your T-SQL query statement below */
select w1.id from Weather w1 join Weather w2 on DATEDIFF(day, w2.recordDate, w1.recordDate) = 1 where w1.temperature > w2.temperature