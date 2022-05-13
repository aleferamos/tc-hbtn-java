import java.util.ArrayList;

public class ListaTodo {
    ArrayList <Tarefa> tarefas;


    public ListaTodo() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        for (Tarefa contagem : tarefas){
            if(contagem.getIdentificador() == tarefa.identificador){
                throw new IllegalArgumentException("Tarefa com identificador " +tarefa.identificador+ " ja existente na lista" );
            }
        }
        tarefas.add(tarefa);

    }

    boolean marcarTarefaFeita(int identificador){
        for(Tarefa contagem : tarefas){
            if(contagem.getIdentificador() == identificador){
                contagem.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    boolean desfazerTarefa(int identificador){
        for(Tarefa contagem: tarefas){
            if(contagem.getIdentificador() == identificador){
                contagem.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for(Tarefa contagem : tarefas){
            contagem.setEstahFeita(false);
        }


    }

    public void fazerTodas(){
        for(Tarefa contagem: tarefas){
            contagem.setEstahFeita(true);
        }

    }

    public void listarTarefas(){
        for(Tarefa contagem: tarefas){
            if(contagem.isEstahFeita() == true)
                System.out.println("[X]  Id: "+contagem.getIdentificador()+ " - Descricao: "+contagem.getDescricao());
            else{
                System.out.println("[ ]  Id: "+contagem.getIdentificador()+ " - Descricao: "+contagem.getDescricao());
            }
        }

    }
}
