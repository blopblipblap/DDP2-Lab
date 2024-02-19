import java.util.ArrayList;

public class Place {
    
    // TODO: Inisiasi attribute yang dimiliki oleh class Place
    private String name;
    private int minPrice;
    private int maxPrice;
    protected ArrayList<Menu> listMenu = new ArrayList<>();

    /**
     * Membuat constructor untuk class Place.
     * @param name nama tempat.
     */
    public Place(String name) {
        this.name = name;
    }
    
    /**
     * Mengembalikan nama yang dimiliki oleh suatu tempat.
     * @return nama dari suatu tempat.
     */
    public String getName() {
        // TODO: Implementasi method ini
        return this.name;
    }

    /**
     * Mengembalikan harga minimum dari menu yang dimiliki oleh suatu tempat.
     * @return harga minimum.
     */
    public int getMinPrice() {
        // TODO: Implementasi method ini
        int minPrice = listMenu.get(0).getPrice();
        for (Menu eachMenu : listMenu) {
            if (eachMenu.getPrice() < minPrice) {
                minPrice = eachMenu.getPrice();
            }
        }
        return minPrice;
    }

    /**
     * Mengembalikan harga maksimum dari menu yang dimiliki oleh suatu tempat.
     * @return harga maksimum.
     */
    public int getMaxPrice() {
        // TODO: Implementasi method ini
        int maxPrice = listMenu.get(0).getPrice();
        for (Menu eachMenu : listMenu) {
            if (eachMenu.getPrice() > maxPrice) {
                maxPrice = eachMenu.getPrice();
            }
        }
        return maxPrice;
    }
    
    /**
     * Menambahkan menu ke dalam suatu tempat.
     * @param menu menu yang akan dimasukkan.
     */
    public void addMenu(Menu menu) {
        if (contains(menu)) {
            System.out.println(String.format("Menu dengan nama %s sudah ada", menu.getName()));
        }
        else {
            this.listMenu.add(menu);
            setMinMaxPrice(menu.getPrice());
            System.out.println(String.format("Menu dengan nama %s sudah ditambahkan di %s", menu.getName(), this.getName()));
        }
    }

    /**
     * Menghapus menu dari suatu tempat.
     * @param menu menu yang akan dihapus.
     */
    public void removeMenu(Menu menu) {
        // TODO: Implementasi method ini
        if (contains(menu)) {
            this.listMenu.remove(menu);
            System.out.println(String.format("Menu dengan nama %s sudah dihapus di %s", menu.getName(), this.name));
        }
        else {
            System.out.println(String.format("Menu dengan nama %s tidak ada", menu.getName(), this.getName()));
        }
    }

    /**
     * Mengupdate minPrice dan maxPrice dari suatu tempat.
     * @param price harga yang baru saja masuk ke dalam menu.
     */
    protected void setMinMaxPrice(int price) {
        if (price > this.maxPrice) {
            this.maxPrice = price;
        }
        if (price < this.minPrice) {
            this.minPrice = price;
        }
    }

    /**
     * Mencari apakah suatu menu ada di suatu tempat.
     * @param menu menu yang dicari.
     * @return true jika menu ada di dalam suatu tempat, false jika sebaliknya.
     */
    protected boolean contains(Menu menu) {
        for(Menu eachMenu : listMenu){
            if (eachMenu.getName().equals(menu.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Mendapatkan menu dengan string tertentu.
     * @param menu nama menu yang dicari.
     * @return objek menu yang dicari.
     */
    protected Menu getMenu(String menu) {
        for(Menu eachMenu : listMenu){
            if (eachMenu.getName().equals(menu)) {
                return eachMenu;
            }
        }
        return null;
    }

    /**
     * Membuat objek dari class Place ke dalam bentuk String.
     * @return format string sesuai dengan format yang ada di soal.
     */
    public String toString() {
        return String.format("%s dengan jangkauan harga Rp %d - Rp %d", this.getName(), this.getMinPrice(), this.getMaxPrice());
    }
}