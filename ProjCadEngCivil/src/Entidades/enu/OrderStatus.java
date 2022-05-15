package Entidades.enu;

public enum OrderStatus {
        ANALISANDO (1),
        ACEITO (2),
        NEGADO (3);

        private int cod;

        private OrderStatus(int cod) {
            this.cod = cod;
        }

        public int getCod(){
            return cod;
        }

        public static OrderStatus setCod(int cod){
                for (OrderStatus valor: OrderStatus.values()
                     ) {
                        if(cod == valor.getCod()){
                                return valor;
                        }
                }
                throw new IllegalArgumentException("Valor invalido! ");
        }
}
