public class Warteg extends Place{ // TODO: Lengkapi baris ini
      
    /**
     * Membuat constructor untuk class Warteg.
     * @param name nama warteg.
     */
    public Warteg(String name){
        // TODO: Implementasi method ini
        super(name);
    }

    /**
     * Menambahkan suatu menu ke warteg. Bila sudah ada, menu diupdate.
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