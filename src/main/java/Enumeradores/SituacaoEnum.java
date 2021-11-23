package Enumeradores;
public enum SituacaoEnum {
        //Constants with values
        FECHADO(1), ABERTO(2), ENCERRADO(3), CANCELADO(4); //Instance variable
        private int i;
        //Constructor to initialize the instance variable
        SituacaoEnum(int i) {
                this.i = i;
        }
        //Static method to display the price
        public int getPrice(){
                return this.i;
        }
}