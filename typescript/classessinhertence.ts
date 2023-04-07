class vehicle{
    name: string;

    constructor(name:string){
    this.name=name;
}
getName():string{
    return this.name;

}

}


class Car extends vehicle
{
    model:string;

    constructor(model:string,name:string){
        super(name);
        this.model=model;
    }

    getNameModel(): string {
        return this.model+this.name; 
    }
}
class Truck extends vehicle {
    constructor(name:string){
        super(name);
    }
}

var mycar= new Car("sports model..","bmw");
console.log(mycar.getNameModel());

var truck= new Truck("tata truck");
console.log(truck.getName());