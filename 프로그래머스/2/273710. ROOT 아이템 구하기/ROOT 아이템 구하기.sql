-- 코드를 작성해주세요
SELECT INFO.ITEM_ID, ITEM_NAME
FROM ITEM_INFO INFO
INNER JOIN (SELECT ITEM_ID
    FROM ITEM_TREE 
    WHERE PARENT_ITEM_ID IS NULL) ROOTS
ON INFO.ITEM_ID = ROOTS.ITEM_ID
ORDER BY INFO.ITEM_ID;