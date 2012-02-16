package beermachine.data.tasks;

import beermachine.data.entities.Product;

// NOT FUNCTIONAL
public class CreateProductTask implements Task<CreateProductTask.Output> {
    private Product product;
    
    public CreateProductTask(Product product) {
        this.product = product;
    }
    
    @Override
    public Output Execute() {
        // DO DATABASE STUFF
        Output output = new Output(Status.ProductAlreadyExists);
        return output;
    }

    public class Output {
        private Status status;
        private Product product;
        
        public Output(Status status, Product product) {
            this.status = status;
            this.product = product;
        }

        public Output(Status status) {
            this(status, null);
        }
    }
    
    public enum Status {
        Success,
        ProductAlreadyExists
    }
}
