<%--
  Created by IntelliJ IDEA.
  User: tanver
  Date: 2/25/22
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">

    <title>Complex Form</title>
</head>

<body class="" style="background: #e2e2e2">

<div class="container mt-4">

    <div class="row">
        <div class="col-md-8 offset-md-2">
            <div class="card">
                <div class="card-body">
                    <h3 class="text-center">Complex Form</h3>
                    <div class="alert alert-danger" role="alert">
                        <form:errors path="student.*"/>
                    </div>
                    <form action="handleForm" method="post">

                        <!--Id  -->
                        <div class="form-group">
                            <label for="id" class="form-label">Enter
                                Your ID </label> <input name="id" type="text" class="form-control"
                                                        id="id" aria-describedby="emailHelp"
                                                        placeholder="Enter Id">
                        </div>

                        <!--Name  -->
                        <div class="form-group">
                            <label for="name" class="form-label">Enter
                                Your Name</label> <input name="name" type="text" class="form-control"
                                                         id="name" aria-describedby="emailHelp"
                                                         placeholder="Enter Name">
                            <div id="emailHelp" class="form-text">We'll never share
                                your email with anyone else.
                            </div>
                        </div>

                        <!--BOB  -->
                        <div class="form-group">
                            <label for="dob" class="form-label">Enter
                                Your DOB </label> <input name="dob" type="text" class="form-control"
                                                         id="dob" aria-describedby="emailHelp"
                                                         placeholder="dd/mm/yyyy">
                        </div>

                        <!--Select  -->
                        <br>
                        <div class="form-group">
                            <label>Select Courses</label> <select
                                name="courses" class="form-control" multiple
                                aria-label="multipleSelectExample">
                            <option value="Java">Java</option>
                            <option value="Hibernate">Hibernate</option>
                            <option value="Spring Core">Spring Core</option>
                            <option value="Spring MVC">Spring MVC</option>
                            <option value="Spring Boot">Spring Boot</option>
                        </select>
                        </div>

                        <!--gender  -->
                        <br>
                        <div class="form-group">
                            <span class="mr-3">Select Gender</span>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender"
                                       id="inlineradio1" value="male"> <label
                                    class="form-check-label" for="inlineradio1">Male</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender"
                                       id="inlineradio2" value="female"> <label
                                    class="form-check-label" for="inlineradio2">Female</label>
                            </div>
                        </div>

                        <!--type  -->
                        <br>
                        <div class="form-group">
                            <label>Select Type</label> <select
                                class="form-conrol" name="type">
                            <option value="regularstudent">Regular Student</option>
                            <option value="oldstudent">Old Student</option>
                        </select>
                        </div>

                        <!--Address  -->
                        <div class="card">
                            <div class="card-body">
                                <p>Your Address</p>
                                <!--Street  -->
                                <div class="form-group">
                                    <input name="address.street" type="text" class="form-control"
                                           placeholder="Enter Street">
                                </div>
                                <!--City-->
                                <div class="form-group">
                                    <input name="address.city" type="text" class="form-control"
                                           placeholder="Enter City">
                                </div>
                            </div>
                        </div>


                        <!--submit  -->
                        <br>
                        <div class="container text-center">
                            <button type="submit" class="btn btn-success">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>