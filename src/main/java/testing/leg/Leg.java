package testing.leg;


class Leg implements Runnable {
    private final String name;
    private static final Object monitor  = new Object() ; //монитор на котором будем синхронизироваться сделаем статически-финальным и сразу проинициализируем

    public Leg(String name){
        this.name = name;
    }

    public void run() {
        try {
            while(true) {    //зациклим до бесконечности пока "нога не сломается"
                synchronized (monitor) {
                    monitor.notifyAll();
                    monitor.wait();
                    System.out.println(name);//обязанностью каждой нити будет просто печатать своё имя в консоль
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Leg error");
        }
    }
}
