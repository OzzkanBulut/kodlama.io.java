public abstract class BaseCreditManager implements  ICreditManager{
    public abstract void calculate(); // değişken olduğu için abstract

    public void save(){ // Her yerde aynı bi method olduğu için herkes burdan alsın dedik
        System.out.println("kaydedildi.");
    }
}
// Bir sınıf sadece bir abstract sınıfı inherit edebilir
// Abstract sınıflar ve interfaceler asla newlenemez
// İkisi de referans tiplerin özelliklerinden yararlanır
// Koddaki değişimi yönetmek için kullanılır