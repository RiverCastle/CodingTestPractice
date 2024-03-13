-- 코드를 작성해주세요
SELECT SUM(G.SCORE) AS SCORE, G.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
FROM HR_GRADE G
INNER JOIN HR_EMPLOYEES E
ON G.EMP_NO = E.EMP_NO
GROUP BY EMP_NO
ORDER BY SCORE desc
LIMIT 1;