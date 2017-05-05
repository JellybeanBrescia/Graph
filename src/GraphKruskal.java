import java.util.Vector;

public class GraphKruskal {


	private int n_vertices;
	private Vector<Node> tree;
	private Vector<Node> kruskal;
	private Vector<Integer> weight_kruskal;
	private boolean[] passati;
	private Vector<String> archi;//archi
	private String primo="0";
	private String secondo="0";




	public GraphKruskal(Vector<Node> _tree) {
		this.tree= _tree;
		this.n_vertices = _tree.size();
		this.archi = new Vector<String>();
		this.kruskal = new Vector<Node>();
		this.weight_kruskal = new Vector<Integer>();
		this.passati = new boolean[n_vertices];
		for(int i=0;i<n_vertices;i++){
			passati[i]=false;
		}
	}

	public void Archi(){
		for(int i=0;i<tree.size();i++){
			String tmp=tree.get(i).getLabel();
			for(int j=0;j<tree.get(i).getEdge().size();j++){
				archi.add(tmp+tree.get(i).getEdge().get(j).getLabel());
				weight_kruskal.add(tree.get(i).getWeight_nodes().get(j));
			}

		}
		for(int i=0;i<archi.size();i++){
			System.out.println(archi.get(i)+ " peso " + weight_kruskal.get(i));
		}

	}


	public int findStart(){
		for(int i=0;i<tree.size();i++){
			if(tree.get(i).isStart()){

				return Integer.parseInt(tree.get(i).getID());

			}
		}
		return 0;
	}
	public void Ordinamento(){
		archi.sort

	}


}




