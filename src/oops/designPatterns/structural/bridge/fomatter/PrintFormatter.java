package oops.designPatterns.structural.bridge.fomatter;


import oops.designPatterns.structural.bridge.Detail;
import oops.designPatterns.structural.bridge.resources.Resource;

import java.util.List;

public class PrintFormatter extends Formatter {

	public PrintFormatter(Resource resource) {
		super(resource);
	}



	@Override
	public String format(String header, List<Detail> details)
		{
			StringBuilder builder = new StringBuilder();
			builder.append(header);
			builder.append("\n");

			for (Detail detail : details) {
				builder.append(detail.getLabel());
				builder.append(":");
				builder.append(detail.getValue());
				builder.append("\n");
			}

			return builder.toString();
		}


	@Override
	public String render() {
		return this.format(this.resource.getHeader(), this.resource.getDetails());
	}
}