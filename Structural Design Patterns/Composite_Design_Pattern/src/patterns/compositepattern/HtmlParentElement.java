package patterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HTMLTag{

	// Attributes
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HTMLTag> childrenTags;
	
	// Constructor
	public HtmlParentElement(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTags = new ArrayList<HTMLTag>();
	}
	
	@Override
	public String getTagName() {
		return tagName;
	}
	
	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	
	@Override
	public void addChildTag(HTMLTag htmlTag) {
		childrenTags.add(htmlTag);
	}
	
	@Override
	public void removeChildTag(HTMLTag htmlTag) {
		childrenTags.remove(htmlTag);
	}
	
	@Override
	public List<HTMLTag> getChildren(){
		return childrenTags;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HTMLTag tag : childrenTags) {
			tag.generateHtml();
		}
		System.out.println(endTag);
	}

}
