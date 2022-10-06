public interface ICreditManager {

    void calculate();
    void save();
}
// Interfacelerin amacı bağımlılıkları engellemektir.
// Interface bir referans tutucudur.
// Yapılan işleri ayırmak için kullanılır.
// Iflerden kurtulmaya yarar
// Bir sınıf sadece bir sınıfı inherit edebilir
//Bir sınıf birden fazla interface i implement edebilir
