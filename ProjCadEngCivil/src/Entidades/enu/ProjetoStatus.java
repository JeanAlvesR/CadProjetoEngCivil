package Entidades.enu;

public enum ProjetoStatus {
        ANALISANDO (1),
        ACEITO (2),
        NEGADO (3);

        private int cod;

        private ProjetoStatus(int cod) {
            this.cod = cod;
        }

        public int getCod(){
            return cod;
        }

        public static ProjetoStatus setCod(int cod){
                for (ProjetoStatus valor: ProjetoStatus.values()
                     ) {
                        if(cod == valor.getCod()){
                                return valor;
                        }
                }
                throw new IllegalArgumentException("Valor invalido! ");
        }
}
