public class Warkop extends Place{ // TODO: Lengkapi baris ini
    
    /**
     * Membuat constructor untuk class Warkop.
     * @param name nama warkop.
     */
    public Warkop(String name){
        // TODO: Implementasi method ini
        super(name);
    }

    /**
     * Menambahkan suatu menu ke warkop. Bila sudah ada, menu diupdate.
     * @param menu menu yang ingin ditambahkan.
     */
    @Override
    public void addMenu(Menu menu) {
        // TODO: Implementasi method ini
        if (contains(menu)) {
            this.setMinMaxPrice(menu.getPrice());
            System.out.println(String.format("Menu dengan nama %s telah di update", menu.getName()));
        }
        else {
            this.listMenu.add(menu);
            this.setMinMaxPrice(menu.getPrice());
            System.out.println(String.format("Menu dengan nama %s sudah ditambahkan di %s", menu.getName(), this.getName()));
        }
    }
}