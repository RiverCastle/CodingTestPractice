-- 코드를 작성해주세요
WITH BIGGEST AS (
    SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR, MAX(SIZE_OF_COLONY) AS MAX
    FROM ECOLI_DATA 
    GROUP BY YEAR)
    
SELECT YEAR, (MAX - SIZE_OF_COLONY) AS YEAR_DEV, ID
FROM ECOLI_DATA 
INNER JOIN BIGGEST
ON YEAR = YEAR(DIFFERENTIATION_DATE)
ORDER BY YEAR, YEAR_DEV;