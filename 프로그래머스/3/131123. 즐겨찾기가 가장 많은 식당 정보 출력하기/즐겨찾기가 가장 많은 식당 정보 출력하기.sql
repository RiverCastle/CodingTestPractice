-- 코드를 입력하세요
SELECT INFO.FOOD_TYPE,	INFO.REST_ID,	INFO.REST_NAME,	INFO.FAVORITES
FROM REST_INFO INFO
INNER JOIN (
    SELECT FOOD_TYPE, MAX(FAVORITES) AS FAVORITES
    FROM REST_INFO 
    GROUP BY FOOD_TYPE) SUB
ON SUB.FAVORITES = INFO.FAVORITES AND INFO.FOOD_TYPE = SUB.FOOD_TYPE
ORDER BY INFO.FOOD_TYPE desc;
