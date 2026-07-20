/* Write your T-SQL query statement below */
select w1.id from Weather w1 join Weather w2 on w1.recordDate = dateadd(day,1,w2.recordDate) where w1.temperature > w2.temperature