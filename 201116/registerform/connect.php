<?php
    $firstName = $_POST['firstName'];            // exactly same value of name='value'
    $lastName = $_POST['lastName'];
    $dob = $_POST['dob'];
    $gender = $_POST['gender'];
    $email = $_POST['email'];
    $phoneNumber = $_POST['phoneNumber'];
    $password = $_POST['pass'];
    $confirmPassword = $_POST['confirmPass'];

    // Database Connection
    $conn = new mysqli('localhost','root','','form1');
    if($conn->connect_error){
    	die('Connection Failed : '.$conn->connect_error);
    }else{
    	$stmt = $conn->prepare("insert into registration(firstName, lastName, dob, gender, email, phoneNumber, password, confirmPassword)
    	       values(?, ?, ?, ?, ?, ?, ?, ?)");
    	
    	$stmt->bind_param("sssssiss",$firstName, $lastName, $dob, $gender, $email, $phoneNumber, $password, $confirmPassword);
    	$stmt->execute();
    	echo "Registration Successful.";
    	$stmt->close();
    	$conn->close();
    }
?>