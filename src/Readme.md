Okay, here's a problem description for the coding challenge:

**Problem Description: Order Summary Generation**

You are given two lists of data: a list of `Product` objects and a list of `Order` objects. Your task is to process these lists and generate an order summary for each valid order.

**Input Data Structures:**

1.  **`Product`**:
    *   `productId` (long): A unique identifier for the product.
    *   `name` (String): The name of the product.
    *   `price` (double): The price of one unit of the product.

2.  **`Order`**:
    *   `orderId` (long): A unique identifier for the order.
    *   `productId` (long): The identifier of the product being ordered.
    *   `quantity` (int): The number of units of the product ordered.

**Task:**

Write a Java program that iterates through the `orders` list. For each order, you need to find the corresponding product details from the `products` list to create an `OrderSummary`.

**`OrderSummary` Structure:**

The `OrderSummary` object for each order should contain the following information:

*   `orderId` (long): From the `Order` object.
*   `productName` (String): The name of the product ordered.
*   `pricePerUnit` (double): The price of a single unit of the product.
*   `quantity` (int): From the `Order` object.
*   `totalPrice` (double): Calculated as `pricePerUnit * quantity`.

**Output:**

For each successfully processed order, print the details of its `OrderSummary`.

**Important Considerations:**

*   **Data Integrity:** An `Order` might contain a `productId` that does not exist in the `products` list. Your solution should gracefully handle such cases (e.g., by skipping the order or printing an appropriate message).
*   **Performance:** Consider the efficiency of your solution, especially if the lists of products and orders were very large. Aim for an approach that minimizes redundant computations or lookups.

You will be provided with sample `Product` and `Order` lists, along with the class definitions for `Product`, `Order`, and `OrderSummary`. Your goal is to implement the logic within the `main` method to generate and print the order summaries.