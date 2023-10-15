class Main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        // Car car=new Car("AMQ123",new Account("Susana Arenas", "1036676"));
        // car.printDataCar();

        UberX uberx= new UberX("PWT678",new Account("Estiven", "4568"), "Mazda", "Sonic");
        uberx.setPasajeros(4);
        uberx.printDataCar();

        // UberVan ubervan= new UberVan("TGP789", new Account("Claudia", "42730"));
        // ubervan.setPasajeros(6);
        // ubervan.printDataCar();
    }
}