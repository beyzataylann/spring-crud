Products Management System
This project is a Product Management System built using Spring MVC and Hibernate to demonstrate CRUD (Create, Read, Update, Delete) operations. It is designed to manage products efficiently with a user-friendly interface built using Thymeleaf.

Features
1. List Products
Displays all the products in a table format.
Includes details such as:
ID: Unique identifier for the product.
Product Name
Price
Stock Quantity
Expiration Date
Delivery Person Name

3. Add New Product
Users can navigate to a form to add a new product by clicking the "ÜRÜN EKLE" button.
The form collects necessary details such as product name, price, stock quantity, and delivery person name.

5. Update Product
Users can update existing product details by clicking the "Düzenle" button for a specific product in the list.
Pre-filled forms show the current details for easy editing.

7. Delete Product
Users can delete products from the list using the "Delete" button.
Includes a confirmation prompt to avoid accidental deletion.

Technology Stack
Spring MVC: For handling HTTP requests and implementing MVC architecture.
Hibernate: For object-relational mapping (ORM) and database interactions.
Thymeleaf: For building a dynamic and interactive user interface.
Maven: For project dependency management.
MySQL: As the database to store product information.

How It Works
Product Listing
The ProductController fetches all product data from the database using the ProductService layer.
Data is displayed on a table using Thymeleaf templates.

Adding a Product
Clicking the "ÜRÜN EKLE" button navigates the user to the product creation form.
The form submission sends a POST request to the ProductController, which saves the product using ProductService and ProductRepository.

Updating a Product
The "Düzenle" button sends a GET request with the product ID.
The ProductController retrieves the product details and shows them in a pre-filled form.
After editing, a POST request updates the product details in the database.
Deleting a Product

The "Sil" button sends a POST request to delete the specific product.
The ProductController processes the request and removes the product from the database using ProductService.
How to Run
Clone the repository:

bash
Kodu kopyala
git clone https://github.com/your-username/ProductsManagementSystem.git
Navigate to the project directory:

bash
Kodu kopyala
cd ProductsManagementSystem
Configure the database connection in application.properties:

properties
Kodu kopyala
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

Run the application:
bash
Kodu kopyala
mvn spring-boot:run

Open your browser and navigate to:
bash
Kodu kopyala
http://localhost:8080/products

Screenshots
Product List
Displays all products in a tabular format.
![image](https://github.com/user-attachments/assets/1a8ce73a-c3f0-4aec-ab34-0fd0880ee9ca)

Add Product Form
Form to add a new product.
![image](https://github.com/user-attachments/assets/b4e57562-48ab-4258-9ff8-ea1b3cf3a6c3)
Edit Product Form
Pre-filled form for updating a product
![image](https://github.com/user-attachments/assets/860a3d4a-ead7-4bb0-af5e-6e1401d61d4a)
