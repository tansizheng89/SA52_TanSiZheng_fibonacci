package sg.nus.fibonacci.domain;


public class Element {
	private Integer elements;

	public Integer getElements() {
		return elements;
	}

	public void setElements(Integer elements) {
		this.elements = elements;
	}

	public Element(Integer elements) {
		super();
		this.elements = elements;
	}

	public Element() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Element [elements=" + elements + "]";
	}
	
	
}
