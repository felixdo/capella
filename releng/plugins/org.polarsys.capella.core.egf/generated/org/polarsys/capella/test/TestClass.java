//Generated with EGF 1.2.0.v20150211-1405
package org.polarsys.capella.test;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.emf.common.util.*;

public class TestClass extends org.eclipse.egf.emf.pattern.base.GenClassJava {
  protected static String nl;

  public static synchronized TestClass create(String lineSeparator) {
    nl = lineSeparator;
    TestClass result = new TestClass();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "/**" + NL + " * Copyright (c) THALES 2007, 2009. All rights reserved." + NL + " */"
      + NL + "package ";
  protected final String TEXT_2 = ";" + NL + NL;
  protected final String TEXT_3 = NL + "import org.polarsys.capella.core.data.capellacommon.CapellacommonFactory;" + NL
      + "import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;";
  protected final String TEXT_4 = NL + "import org.polarsys.capella.core.data.ctx.CtxFactory;" + NL
      + "import org.polarsys.capella.core.data.ctx.CtxPackage;";
  protected final String TEXT_5 = NL + "import org.polarsys.capella.core.data.information.InformationFactory;" + NL
      + "import org.polarsys.capella.core.data.information.InformationPackage;";
  protected final String TEXT_6 = NL + "import org.polarsys.capella.core.data.fa.FaFactory;" + NL
      + "import org.polarsys.capella.core.data.fa.FaPackage;";
  protected final String TEXT_7 = NL + "import org.polarsys.capella.core.data.fa.FaFactory;" + NL
      + "import org.polarsys.capella.core.data.fa.FaPackage;";
  protected final String TEXT_8 = NL + "import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;" + NL
      + "import org.polarsys.capella.core.data.capellacore.CapellacorePackage;";
  protected final String TEXT_9 = NL + NL + "import ";
  protected final String TEXT_10 = ".";
  protected final String TEXT_11 = ";" + NL + "import ";
  protected final String TEXT_12 = ".";
  protected final String TEXT_13 = ";" + NL + "" + NL + "import org.polarsys.capella.core.data.sharedmodel.GenericPkg;"
      + NL + "" + NL + "import org.polarsys.capella.core.model.tests.ju.CapellaModelAbstractTest;" + NL
      + "import org.polarsys.capella.core.model.tests.ju.CapellaModelAbstractTestSuite;" + NL;
  protected final String TEXT_14 = "/**" + NL + " * Class generated by SolFa." + NL
      + " * This code shall not be modified manually." + NL + " *" + NL + " * @generated" + NL + " */" + NL
      + "public class Test_";
  protected final String TEXT_15 = " extends CapellaModelAbstractTest {" + NL + "" + NL + "  /**" + NL
      + "   * Constructor" + NL + "   * @param testSuite_p" + NL + "   * @generated" + NL + "   */" + NL
      + "  public Test_";
  protected final String TEXT_16 = "(CapellaModelAbstractTestSuite testSuite_p) {" + NL + "    super(testSuite_p);"
      + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * @generated" + NL + "   */" + NL + "  public void test_";
  protected final String TEXT_17 = "() {" + NL + "    testCreateElement();" + NL + "  }" + NL + "" + NL + "  /**" + NL
      + "   * @param container_p" + NL + "   * @generated" + NL + "   */" + NL + "  @Override" + NL
      + "  protected void runMe(GenericPkg container_p) {";
  protected final String TEXT_18 = NL
      + "    elementCreation(container_p, CapellacommonFactory.eINSTANCE, CapellacommonPackage.Literals.GENERIC_TRACE, ";
  protected final String TEXT_19 = ".eINSTANCE, ";
  protected final String TEXT_20 = ".Literals.";
  protected final String TEXT_21 = ", ";
  protected final String TEXT_22 = ".eINSTANCE, ";
  protected final String TEXT_23 = ".Literals.";
  protected final String TEXT_24 = ");";
  protected final String TEXT_25 = NL
      + "    elementCreation(container_p, CtxFactory.eINSTANCE, CtxPackage.Literals.ACTOR_MISSION_INVOLVEMENT, ";
  protected final String TEXT_26 = ".eINSTANCE, ";
  protected final String TEXT_27 = ".Literals.";
  protected final String TEXT_28 = ", CtxFactory.eINSTANCE, CtxPackage.Literals.ACTOR);";
  protected final String TEXT_29 = NL
      + "    elementCreation(container_p, CtxFactory.eINSTANCE, CtxPackage.Literals.ACTOR_MISSION_INVOLVEMENT, CtxFactory.eINSTANCE, CtxPackage.Literals.MISSION, ";
  protected final String TEXT_30 = ".eINSTANCE, ";
  protected final String TEXT_31 = ".Literals.";
  protected final String TEXT_32 = ");";
  protected final String TEXT_33 = NL
      + "    elementCreation(container_p, InformationFactory.eINSTANCE, InformationPackage.Literals.PROPERTY, ";
  protected final String TEXT_34 = ".eINSTANCE, ";
  protected final String TEXT_35 = ".Literals.";
  protected final String TEXT_36 = ");";
  protected final String TEXT_37 = NL
      + "    elementCreation(container_p, FaFactory.eINSTANCE, FaPackage.Literals.COMPONENT_EXCHANGE, ";
  protected final String TEXT_38 = ".eINSTANCE, ";
  protected final String TEXT_39 = ".Literals.";
  protected final String TEXT_40 = ", ";
  protected final String TEXT_41 = ".eINSTANCE, ";
  protected final String TEXT_42 = ".Literals.";
  protected final String TEXT_43 = ");";
  protected final String TEXT_44 = NL
      + "    elementCreation(container_p, FaFactory.eINSTANCE, FaPackage.Literals.COMPONENT_EXCHANGE, ";
  protected final String TEXT_45 = ".eINSTANCE, ";
  protected final String TEXT_46 = ".Literals.";
  protected final String TEXT_47 = ", FaFactory.eINSTANCE, FaPackage.Literals.IN_FLOW_PORT);";
  protected final String TEXT_48 = NL
      + "    elementCreation(container_p, FaFactory.eINSTANCE, FaPackage.Literals.COMPONENT_EXCHANGE, FaFactory.eINSTANCE, FaPackage.Literals.OUT_FLOW_PORT, ";
  protected final String TEXT_49 = ".eINSTANCE, ";
  protected final String TEXT_50 = ".Literals.";
  protected final String TEXT_51 = ");";
  protected final String TEXT_52 = NL
      + "    elementCreation(container_p, FaFactory.eINSTANCE, FaPackage.Literals.FUNCTIONAL_EXCHANGE, ";
  protected final String TEXT_53 = ".eINSTANCE, ";
  protected final String TEXT_54 = ".Literals.";
  protected final String TEXT_55 = ", ";
  protected final String TEXT_56 = ".eINSTANCE, ";
  protected final String TEXT_57 = ".Literals.";
  protected final String TEXT_58 = ");";
  protected final String TEXT_59 = NL
      + "    elementCreation(container_p, CapellacoreFactory.eINSTANCE, CapellacorePackage.Literals.GENERALIZATION, ";
  protected final String TEXT_60 = ".eINSTANCE, ";
  protected final String TEXT_61 = ".Literals.";
  protected final String TEXT_62 = ", ";
  protected final String TEXT_63 = ".eINSTANCE, ";
  protected final String TEXT_64 = ".Literals.";
  protected final String TEXT_65 = ", ";
  protected final String TEXT_66 = ".eINSTANCE, ";
  protected final String TEXT_67 = ".Literals.";
  protected final String TEXT_68 = ");";
  protected final String TEXT_69 = NL + "  }" + NL + "" + NL + "  /**" + NL
      + "   * @see org.polarsys.capella.test.common.ju.AbstractCapellaTest#getTestName()" + NL + "   * @generated" + NL
      + "   */" + NL + "  @Override" + NL + "  protected String getTestName() {" + NL + "    return \"test_";
  protected final String TEXT_70 = "\"; //$NON-NLS-1$" + NL + "  }" + NL + "}" + NL;
  protected final String TEXT_71 = NL;
  protected final String TEXT_72 = NL;

  public TestClass() {
    //Here is the constructor
    StringBuffer stringBuffer = new StringBuffer();

  }

  public String generate(Object argument) throws Exception {
    final StringBuffer stringBuffer = new StringBuffer();

    InternalPatternContext ctx = (InternalPatternContext) argument;
    Map<String, String> queryCtx = null;
    IQuery.ParameterDescription paramDesc = null;
    Node.Container currentNode = ctx.getNode();

    List<Object> parameterList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object parameterParameter : parameterList) {

      this.parameter = (org.eclipse.emf.codegen.ecore.genmodel.GenClass) parameterParameter;

      if (preCondition(ctx)) {
        ctx.setNode(new Node.Container(currentNode, getClass()));
        orchestration(ctx);
      }

    }
    ctx.setNode(currentNode);
    if (ctx.useReporter()) {
      ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
    }

    stringBuffer.append(TEXT_71);
    stringBuffer.append(TEXT_72);
    return stringBuffer.toString();
  }

  public String orchestration(PatternContext ctx) throws Exception {
    InternalPatternContext ictx = (InternalPatternContext) ctx;

    super.orchestration(new SuperOrchestrationContext(ictx));

    method_generatePackage(new StringBuffer(), ictx);

    method_generateImports(new StringBuffer(), ictx);

    method_generateContents(new StringBuffer(), ictx);

    if (ictx.useReporter()) {
      Map<String, Object> parameterValues = new HashMap<String, Object>();
      parameterValues.put("parameter", this.parameter);
      String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
      String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
      ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
    }
    return null;
  }

  protected org.eclipse.emf.codegen.ecore.genmodel.GenClass genClass = null;

  public void set_genClass(org.eclipse.emf.codegen.ecore.genmodel.GenClass object) {
    this.genClass = object;
  }

  protected java.lang.String eclassCondition = null;

  public void set_eclassCondition(java.lang.String object) {
    this.eclassCondition = object;
  }

  protected java.lang.String generatedSourceFolderPath = null;

  public void set_generatedSourceFolderPath(java.lang.String object) {
    this.generatedSourceFolderPath = object;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

  protected void method_setReporterVariables(final StringBuffer stringBuffer, final PatternContext ctx)
      throws Exception {

    genClass = parameter;
    eclassCondition = (String) ctx.getValue("eclassCondition");
    generatedSourceFolderPath = (String) ctx.getValue("generatedSourceFolderPath");

    targetPath = "/org.polarsys.capella.core.model.tests.ju/generated";
    packageName = generatedSourceFolderPath;
    className = "Test_" + genClass.getName();

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setReporterVariables", stringBuffer.toString());
  }

  protected void method_generatePackage(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    stringBuffer.append(TEXT_1);
    stringBuffer.append(generatedSourceFolderPath);
    stringBuffer.append(TEXT_2);
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "generatePackage", stringBuffer.toString());
  }

  protected void method_generateImports(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    if (eclassCondition.equals("TraceableElement")) {
      stringBuffer.append(TEXT_3);
    } else if (eclassCondition.equals("InvolverElement") || eclassCondition.equals("InvolvedElement")) {
      stringBuffer.append(TEXT_4);
    } else if (eclassCondition.equals("AbstractType")) {
      stringBuffer.append(TEXT_5);
    } else if (eclassCondition.equals("InformationsExchanger")) {
      stringBuffer.append(TEXT_6);
    } else if (eclassCondition.equals("InformationsSender") || eclassCondition.equals("InformationsReceiver")) {
    } else if (eclassCondition.equals("ActivityNode")) {
      stringBuffer.append(TEXT_7);
    } else if (eclassCondition.equals("InvolverElement") || eclassCondition.equals("GeneralizableElement")) {
      stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getNSName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genPackage.getNSName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_13);
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "generateImports", stringBuffer.toString());
  }

  protected void method_generateContents(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getEcoreClass().getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genClass.getEcoreClass().getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genClass.getEcoreClass().getName());
    stringBuffer.append(TEXT_17);
    if (eclassCondition.equals("TraceableElement")) {
      stringBuffer.append(TEXT_18);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_19);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_20);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_21);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_22);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_23);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_24);
    } else if (eclassCondition.equals("InvolverElement")) {
      stringBuffer.append(TEXT_25);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_26);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_27);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_28);
    } else if (eclassCondition.equals("InvolvedElement")) {
      stringBuffer.append(TEXT_29);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_30);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_31);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_32);
    } else if (eclassCondition.equals("AbstractType")) {
      stringBuffer.append(TEXT_33);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_34);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_35);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_36);
    } else if (eclassCondition.equals("InformationsExchanger")) {
      stringBuffer.append(TEXT_37);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_38);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_39);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_40);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_41);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_42);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_43);
    } else if (eclassCondition.equals("InformationsSender")) {
      stringBuffer.append(TEXT_44);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_45);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_46);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_47);
    } else if (eclassCondition.equals("InformationsReceiver")) {
      stringBuffer.append(TEXT_48);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_49);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_50);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_51);
    } else if (eclassCondition.equals("ActivityNode")) {
      stringBuffer.append(TEXT_52);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_53);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_54);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_55);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_56);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_57);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_58);
    } else if (eclassCondition.equals("GeneralizableElement")) {
      stringBuffer.append(TEXT_59);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_60);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_61);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_62);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_63);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_64);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_65);
      stringBuffer.append(genPackage.getFactoryInterfaceName());
      stringBuffer.append(TEXT_66);
      stringBuffer.append(genPackage.getPackageInterfaceName());
      stringBuffer.append(TEXT_67);
      stringBuffer.append(genPackage.getClassifierID(genClass));
      stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genClass.getEcoreClass().getName());
    stringBuffer.append(TEXT_70);
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "generateContents", stringBuffer.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    genClass = parameter;
    eclassCondition = (String) ctx.getValue("eclassCondition");
    generatedSourceFolderPath = (String) ctx.getValue("generatedSourceFolderPath");

    if (!genClass.isAbstract()) {
      EClass eclass = genClass.getEcoreClass();
      EAnnotation annotation = eclass.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
      if (annotation != null) {
        EMap<String, String> details = annotation.getDetails();
        String value = details.get("documentation");
        if ((value != null) && value.startsWith("@deprecated")) {
          return false;
        }
      }

      if (null != eclassCondition) {
        for (EClass superClass : eclass.getEAllSuperTypes()) {
          String superClassName = superClass.getName();
          if ((superClassName != null) && superClassName.equalsIgnoreCase(eclassCondition)) {
            return true;
          }
        }
      }
    }
    return false;
  }
}