select * from Book;
select name from Book;
select b.ID,b."NAME",b.PRICE from Book b;


-- 計算每本平均價格
SELECT b."NAME", SUM(b.PRICE * b.AMOUNT) as subtotal,
       SUM(b.AMOUNT) as amount, 
       SUM(b.PRICE * b.AMOUNT) / SUM(b.AMOUNT) as avg_price
FROM BOOK b
GROUP BY b."NAME"


-- 全部書籍的總價值
select SUM(b.PRICE * b.AMOUNT) as total from book b




