-- 價格一律加 10%
update Book set price = price*1.1;

-- 價格一律 1 元
update Book set price = 1;

-- 修改 id=1 的資料 name=Java8 price=200
update Book set name='Java8' , price=200 where id=1

