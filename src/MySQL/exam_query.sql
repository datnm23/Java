select * from Products;

-- 1 Lấy thông tin tất cả các sản phẩm đã được đặt trong một đơn đặt hàng cụ thể.

SELECT Products.product_id ,Products.product_name,Products.category_id ,Products.price,OrderDetails.quantity FROM Products
inner join OrderDetails
on Products.product_id=OrderDetails.product_id
where OrderDetails.order_id=1;

-- 2 Tính tổng số tiền trong một đơn đặt hàng cụ thể.

SELECT SUM(Products.price*OrderDetails.quantity)  as bill_of_order FROM Products
inner join OrderDetails
on Products.product_id=OrderDetails.product_id
where OrderDetails.order_id=1;

-- 3 Lấy danh sách các sản phẩm chưa có trong bất kỳ đơn đặt hàng nào.

SELECT Products.product_id ,Products.product_name,Products.category_id ,Products.price as bill_of_order FROM Products
left join OrderDetails
on Products.product_id=OrderDetails.product_id
where OrderDetails.product_id is null;

-- 4 Đếm số lượng sản phẩm trong mỗi danh mục. (category_name, total_products)

select Categories.category_name,count(Products.product_id ) as total_products from Categories
inner join Products
on Categories.category_id=Products.category_id
group by Categories.category_id;

-- 5 Tính tổng số lượng sản phẩm đã đặt bởi mỗi khách hàng (customer_name, total_ordered)

select Customers.customer_name, sum(OrderDetails.quantity) as total_ordered from Customers
inner join Orders
on Customers.customer_id=Orders.customer_id
inner join OrderDetails
on Orders.order_id =  OrderDetails.order_id
group by Customers.customer_id;

-- 6 Lấy thông tin danh mục có nhiều sản phẩm nhất (category_name, product_count)

select Categories.category_name as category_name,count(OrderDetails.quantity ) as total_ordered from Categories
inner join Products
on Categories.category_id=Products.category_id
inner join OrderDetails
on Products.product_id=OrderDetails.product_id
group by Categories.category_id
order by total_ordered desc
limit 1;

-- 7 Tính tổng số sản phẩm đã được đặt cho mỗi danh mục (category_name, total_ordered)

select Categories.category_name as category_name,sum(OrderDetails.quantity) as total_ordered from Categories
inner join Products
on Categories.category_id=Products.category_id
inner join OrderDetails
on Products.product_id=OrderDetails.product_id
group by category_name;

-- 8 Lấy thông tin về top 3 khách hàng có số lượng sản phẩm đặt hàng lớn nhất (customer_id, customer_name, total_ordered))

select Customers.customer_id,Customers.customer_name,count(OrderDetails.quantity ) as total_ordered from Customers
inner join Orders
on Customers.customer_id=Orders.customer_id
inner join OrderDetails
on Orders.order_id=OrderDetails.order_id
group by Customers.customer_id
order by total_ordered desc
limit 3;

-- 9 Lấy thông tin về khách hàng đã đặt hàng nhiều hơn một lần trong khoảng thời gian cụ thể từ ngày A -> ngày B (customer_id, customer_name, total_orders)

select Customers.customer_id,Customers.customer_name,count(Orders.order_id) as total_ordered from Customers
inner join Orders
on Customers.customer_id=Orders.customer_id
where Orders.order_date between '2024-06-01' and '2024-06-03'
group by customer_id
having total_ordered>1;

-- 10 Lấy thông tin về các sản phẩm đã được đặt hàng nhiều lần nhất và số lượng đơn đặt hàng tương ứng (product_id, product_name, total_ordered)
select Products.product_id,Products.product_name,(sum(OrderDetails.quantity)) as total_products ,count(OrderDetails.order_id) as total_ordered from Products
inner join OrderDetails
on Products.product_id=OrderDetails.product_id
group by product_id
order by total_products desc
limit 1;
