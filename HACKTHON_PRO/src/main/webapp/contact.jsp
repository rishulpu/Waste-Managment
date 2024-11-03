<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us - Recycle Plastic</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
    
       <% String name=(String)request.getAttribute("name"); %>
    
        <h1>Contact Us : <%= name %> </h1>
        <nav>
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="products.html">Products</a></li>
                <li><a href="contact.html">Contact</a></li>
            </ul>
        </nav>
    </header>
    <section class="contact-form">
        <h2>Contact For Query</h2>
        <form>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="message">Message:</label>
            <textarea id="message" name="message" required></textarea>
            
            <button type="submit" class="btn">Send Message</button>
        </form>
    </section>
    <footer>
    </footer>
    <script src="script.js"></script>
</body>
</html>
