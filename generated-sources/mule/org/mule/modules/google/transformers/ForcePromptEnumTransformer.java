
package org.mule.modules.google.transformers;

import javax.annotation.Generated;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.modules.google.ForcePrompt;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

@Generated(value = "Mule DevKit Version 3.5.0-M4", date = "2014-03-26T12:31:10-05:00", comments = "Build M4.1875.17b58a3")
public class ForcePromptEnumTransformer
    extends AbstractTransformer
    implements DiscoverableTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;

    public ForcePromptEnumTransformer() {
        registerSourceType(DataTypeFactory.create(String.class));
        setReturnClass(ForcePrompt.class);
        setName("ForcePromptEnumTransformer");
    }

    protected Object doTransform(Object src, String encoding)
        throws TransformerException
    {
        ForcePrompt result = null;
        result = Enum.valueOf(ForcePrompt.class, ((String) src));
        return result;
    }

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

}
