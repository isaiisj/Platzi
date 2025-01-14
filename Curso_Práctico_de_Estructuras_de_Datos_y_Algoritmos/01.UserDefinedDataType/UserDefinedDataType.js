class client 
{
    constructor (name, id, credit, adress){
        this.name = name
        this.id = id
        this.credit = credit
        this.adress = adress
    }
}

let client1 = new client ("Camilo Valencia", 1, 1000000, "caller 1, carrera 1, ciudad Bolivar")

console.log(client1);
