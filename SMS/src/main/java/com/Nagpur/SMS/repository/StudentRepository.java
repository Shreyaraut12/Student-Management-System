package com.Nagpur.SMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nagpur.SMS.Entity.Student;
@Repository                                                      //key value 
public interface StudentRepository extends JpaRepository<Student,Integer> {

}

/*
 * <form th:action="@{/students}" th:object="${student}" method="post">

		<div class="form-group">

			<label>Student First Name </label>

			<input type="text" name="firstName" id="firstName" placeholder="Enter First Name"/>

		</div>

		<br>

		<div class="form-group">

			<label>Student Last Name </label>

			<input type="text" name="lastName" id="lastName" placeholder="Enter Last Name"/>

		</div>

		<br>

		<div class="form-group">

			<label>Student Email </label>

			<input type="email" name="email" id="email" placeholder="email"/>

		</div>

		

		<div class="box-footer">

			<button type="submit" class="btn btn-primary">

				Submit

			</button>



		</div>

	</form>
*/
 