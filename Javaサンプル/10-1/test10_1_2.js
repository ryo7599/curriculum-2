class Car{
    constructor(price,number){
        this.price = price;
        this.number = number;
    }
     getNumGas() {
        console.log(`ガソリンは ${this.price}です。ナンバーは${this.number}です`);
    }
        
}

const instance = new Car(143,43-42);
instance.getNumGas();