package polyjuice.phial.model

case class Hgvs2VcfRequest(
  entries: Seq[HgvsEntry],
  appendInfoFields: Option[Seq[VcfKeyBuilder]],
  appendFormatFields: Option[Seq[VcfKeyBuilder]],
  maxVariantsPerEntry: Option[Int],
  vcfFileFormat: Option[String],
  addChrPrefix: Option[Boolean])