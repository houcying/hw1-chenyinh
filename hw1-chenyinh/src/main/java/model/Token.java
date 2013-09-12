

/* First created by JCasGen Wed Sep 11 21:09:06 EDT 2013 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 23:10:34 EDT 2013
 * XML source: /home/houcy/git/hw1-chenyinh/hw1-chenyinh/src/main/resources/hw1-chenyinh-typesystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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

  /** getter for casProcessorId - gets indicate where the token was originally made by
   * @generated */
  public String getCasProcessorId() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "model.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets indicate where the token was originally made by 
   * @generated */
  public void setCasProcessorId(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "model.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets indicate how confidence the token is
   * @generated */
  public float getConfidence() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.Token");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Token_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets indicate how confidence the token is 
   * @generated */
  public void setConfidence(float v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "model.Token");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Token_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: wordClass

  /** getter for wordClass - gets indicate the part of speech of a token
   * @generated */
  public String getWordClass() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_wordClass == null)
      jcasType.jcas.throwFeatMissing("wordClass", "model.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_wordClass);}
    
  /** setter for wordClass - sets indicate the part of speech of a token 
   * @generated */
  public void setWordClass(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_wordClass == null)
      jcasType.jcas.throwFeatMissing("wordClass", "model.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_wordClass, v);}    
  }

    