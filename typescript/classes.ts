class Employee1{
    private fname:string;
    private mname!:string;
    private lname:string;

        constructor(fname:string,mname:string,lname:string,)
        {
            this.fname=fname;
            this.mname=mname;
            this.lname=lname;
        }
    
       
    getName():string{
        return this.mname;
    }
}
    let e1=new Employee1('a','b','c');
    console.log(e1.getName);
 




class Employee{
   private empno:number;
   private ename:string;
   private  sal:number;
   private attendance:any;

   public getEmp():number{
    return this.empno;
   }

   public getEname():string{
    return this.ename="sree";
   }

   public getsal():number{
    return this.sal;
   }

   public getAttendence():number{
    return this.attendance;
   }

    // constructor(){
    //     this.empno=101;
    //     this.ename="sree";
    //     this.sal=200000;
    //     this.attendance=18;
    
    // }
    constructor(empno:number,
            ename:string,
            sal:number,attendence: any)
            {
            this.empno=empno;
            this.ename=ename;
            this.sal=sal;
            this.attendance=attendence;
        }
    print():void{
        console.log(this.empno,this.ename,this.sal,this.attendance);
    }
}
    {
    // var emp=new Employee();
   
    // var emp1=new Employee();
    // emp1.empno=102;
    // var emp2=new Employee();
   
    let emp=new Employee(1,'abc',3000,20);
    let emp1=new Employee(2,'bbc',2000,30);
    let emp2=new Employee(3,'cde',3500,25);
    var emparray: Employee[]=[emp,emp1,emp2];
        emparray.forEach(emparrays => {
           console.log(emparrays);
            
        });
    // emp2.empno=103;
    emp.print();
    emp1.print();
    emp2.print();

}

