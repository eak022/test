<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Test Page</title>
</head>
<body>
    <h1>Received Data</h1>
    <?php
    // Check if form data is submitted
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        // Retrieve data from the form
        $first_name = $_POST["first-name"];
        $last_name = $_POST["last-name"];
        $age = $_POST["age"];

        // Display the received data
        echo "<p id=\"firstname\">First Name: $first_name</p>";
        echo "<p>Last Name: $last_name</p>";
        echo "<p>Age: $age</p>";
    } else {
        // If no data is submitted, display a message
        echo "<p>No data received.</p>";
    }
    ?>
</body>
</html>
