public class GPU {
    String brand;
    String name_of_gpu;
    String series;
    String memory_size;
    String price;
    String seller;

    void displayGPU(){
        System.out.printf("Brand: %s\nGPU Name: %s\nSeries: %s\nMemory Size: %s\nPrice: %s\nSeller: %s",
                brand,name_of_gpu,series,memory_size,price,seller);
    }
    public GPU(String brand, String name_of_gpu, String series,String memory_size,String price,String seller){
        this.brand = brand;
        this.name_of_gpu = name_of_gpu;
        this.series = series;
        this.memory_size = memory_size;
        this.price = price;
        this.seller = seller;
    }
}
