

/* First created by JCasGen Wed Sep 11 21:09:06 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.TOP;


/** the score of answer
 * Updated by JCasGen Wed Sep 11 23:10:34 EDT 2013
 * XML source: /home/houcy/git/hw1-chenyinh/hw1-chenyinh/src/main/resources/hw1-chenyinh-typesystem.xml
 * @generated */
public class Score extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Score.class);
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
  protected Score() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Score(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Score(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets indicate where the score was originally made by
   * @generated */
  public Annotation getCasProcessorId() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "model.Score");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Score_Type)jcasType).casFeatCode_casProcessorId)));}
    
  /** setter for casProcessorId - sets indicate where the score was originally made by 
   * @generated */
  public void setCasProcessorId(Annotation v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "model.Score");
    jcasType.ll_cas.ll_setRefValue(addr, ((Score_Type)jcasType).casFeatCode_casProcessorId, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets indicate the score of the answer
   * @generated */
  public double getScore() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "model.Score");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Score_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets indicate the score of the answer 
   * @generated */
  public void setScore(double v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "model.Score");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Score_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: confidency

  /** getter for confidency - gets indicate how confidence the score was
   * @generated */
  public float getConfidency() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_confidency == null)
      jcasType.jcas.throwFeatMissing("confidency", "model.Score");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Score_Type)jcasType).casFeatCode_confidency);}
    
  /** setter for confidency - sets indicate how confidence the score was 
   * @generated */
  public void setConfidency(float v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_confidency == null)
      jcasType.jcas.throwFeatMissing("confidency", "model.Score");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Score_Type)jcasType).casFeatCode_confidency, v);}    
  }

    