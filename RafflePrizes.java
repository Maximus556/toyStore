public class RafflePrizes {
    public static void main(String[] args) {

        // добавление новых игрушек с указанием их id, количества и веса, когда игрушка заканчивается, массив сдвигается
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(new Toy(1, "Мишка", 1, 25.0));
        toyStore.addToy(new Toy(2, "Кукла", 8, 20.0));
        toyStore.addToy(new Toy(3, "Машинка",12, 15.0));
        toyStore.addToy(new Toy(4, "Настольная игра", 6, 10.0));
        toyStore.addToy(new Toy(5, "Юла", 6, 30.0));
        toyStore.addToy(new Toy(6, "Пикачу", 6, 15.0));

        // Возможность изменять шанс выпадения определенной игрушки
        toyStore.editToyWeight(1, 10.0);
        toyStore.editToyWeight(2, 20.0);
        toyStore.editToyWeight(3, 15.0);
        toyStore.editToyWeight(4, 10.0);
        toyStore.editToyWeight(5, 12.0);
        toyStore.editToyWeight(6, 20.0);
        
        // Количество розыгрышей, прописываем в i < 3, всё записывается в фаил prize - toy.txt, после каждого розыгрыша призов уменьшает количество выйгранных игрушек 
        for (int i = 0; i < 3; i++) {
            toyStore.choosePrizeToy();
            Toy prizeToy = toyStore.getPrizeToy();
            System.out.println("Выйгранная игрушка: " + prizeToy.getName());
            System.out.println("---------------------------------------------------------");
            System.out.println("Магазин: \n" + toyStore);
        }
    }

}