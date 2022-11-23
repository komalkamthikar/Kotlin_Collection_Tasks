package collection

class Employee(Emp_id:Int,Emp_name:String,Emp_dept:String,Emp_age:Int,Emp_salary:Double)
{
    var id:Int=Emp_id
    var name:String=Emp_name
    var dept:String=Emp_dept
    var age:Int=Emp_age
    var salary:Double=Emp_salary

}
fun main() {
    var Employeeinfo= mutableListOf<Employee>()
    Employeeinfo.add (Employee(101,"shiva","IT",34,56000.00))
    Employeeinfo.add(Employee(102,"riya","Accounts",30,45000.00))
    Employeeinfo.add(Employee(103,"Kushi","Business",22,40000.00))
    Employeeinfo.add(Employee(104,"sai","IT",24,42000.00))
    Employeeinfo.add(Employee(105,"priyanka","Accounts",33,52000.00))

    for (Employee in Employeeinfo)
        println("Employee Id: ${Employee.id} \nEmployee Name:${Employee.name} \nEmployee Dept: ${Employee.dept}  Employee Age:${Employee.age} Employee Salary:${Employee.salary}")


}