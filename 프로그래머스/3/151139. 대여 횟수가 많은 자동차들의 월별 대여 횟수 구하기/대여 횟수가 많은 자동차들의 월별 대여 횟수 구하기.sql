-- 코드를 입력하세요
WITH OVER_FIVE AS (
    SELECT CAR_ID, COUNT(*)
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE BETWEEN '2022-08-01' and '2022-10-31'
    GROUP BY CAR_ID
    HAVING COUNT(*) >= 5
)
SELECT MONTH(START_DATE) AS MONTH,	H.CAR_ID,	COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
INNER JOIN OVER_FIVE
ON H.CAR_ID = OVER_FIVE.CAR_ID
WHERE START_DATE BETWEEN '2022-08-01' and '2022-10-31'
GROUP BY MONTH, CAR_ID
ORDER BY MONTH, CAR_ID DESC;