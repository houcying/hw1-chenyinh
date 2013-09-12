

/* First created by JCasGen Wed Sep 11 21:09:06 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** the annotation for question
 * Updated by JCasGen Wed Sep 11 23:10:34 EDT 2013
 * XML source: /home/houcy/git/hw1-chenyinh/hw1-chenyinh/src/main/resources/hw1-chenyinh-typesystem.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets indicate where the question was originally made by
   * @generated */
  public String getCasProcessorId() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "model.Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets indicate where the question was originally made by 
   * @generated */
  public void setCasProcessorId(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "model.Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets indicate how confidence the question is
   * @generated */
  public float getConfidence() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.Question");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Question_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets indicate how confidence the question is 
   * @generated */
  public void setConfidence(float v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.Question");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Question_Type)jcasType).casFeatCode_confidence, v);}    
  }

    