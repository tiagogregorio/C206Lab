public class Empresa
{
    String nomeempr;
    Produto[] produtos = new Produto[100];

    public Empresa (String nomeempr)
    {
        this.nomeempr = nomeempr;
    }

    void mostraInfo()
    {
        System.out.println("Nome da Empresa: "+this.nomeempr);
        System.out.println("Informacoes dos Produtos: ");
        System.out.println("-------------------------");
        for (int i = 0; i < produtos.length; i++)
        {
            if(produtos[i]!=null)
            {
                produtos[i].mostraInfo();
            }
        }
    }

    public void adicionaProduto(Produto produto)
    {
        for (int i = 0; i < produtos.length; i++)
        {
            if(produtos[i]==null)
            {
                produtos[i] = produto;
                System.out.println("Produto adicionado!");
                break;
            }

        }
    }

    void mostraProdutosEspecificos(String cnpj)
    {
        for (int i = 0; i < produtos.length; i++)
        {
            if (produtos[i]!=null){
                if(produtos[i].fabri.cnpj.equals(cnpj))
                    System.out.println(produtos[i].nome);
                else
                    System.out.println("Fabricante sem produtos registrados no sistema");
                break;
            }
        }
    }

    double verificaMelhoresProdutos()
    {
        double porcet=0;
        int totaldeprodutos=0;

        for (int i = 0; i < produtos.length; i++)
        {
            if(produtos[i]!=null)
                totaldeprodutos = totaldeprodutos +produtos[i].quantidade;
        }

        for (int i = 0; i < produtos.length; i++)
        {
            if(produtos[i]!=null) {
                if (produtos[i].quantidade != 0 && produtos[i].nota >= 3)
                    porcet = (double) (100 * produtos[i].quantidade) / totaldeprodutos;
            }

        }
        return porcet;
    }

    boolean comprarProduto(String pn)
    {
        boolean oq = true;

        for (int i = 0; i < produtos.length; i++)
        {
            if(produtos[i]!=null)
            {
                if(produtos[i].partNumber.equals(pn) && produtos[i].quantidade!=0)
                {
                    produtos[i].quantidade--;
                    oq=true;
                    break;
                }

                else
                {
                    oq=false;
                    break;
                }
            }
        }
        return oq;
    }
}
