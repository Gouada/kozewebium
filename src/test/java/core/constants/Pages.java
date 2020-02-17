package core.constants;

public enum Pages 
{
	Aceuil 		("Jeune Afrique – Premier site", "https://www.jeuneafrique.com/"),
	Politique 	("Politique", "https://www.jeuneafrique.com/rubriques/politique/"),
	Sport 		("Sport", "https://www.jeuneafrique.com/rubriques/sport/"),
	Economie 		("Économie", "https://www.jeuneafrique.com/rubriques/economie/"),
	Societe 	("Societé", "https://www.jeuneafrique.com/rubriques/societe/");
	
	
	private String pageTitle;
	private String pageUrl;
	
	Pages(String pageTitle, String pageUrl)
	{
		this.setPageTitle(pageTitle);
		this.setPageUrl(pageUrl);
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	
}
